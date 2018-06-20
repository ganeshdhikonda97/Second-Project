myApp.service('chatService',function($q,$timeout))
{
	
service.RECONNECT_TIMEOUT=30000;
var base_url="http://localhost:8092/ChatMiddleware";
service.SOCKET_URL=base_url+"/chat";

var service={},listener=$q.defer(),socket={client:null,stomp:null},messageIds=[];
service.CHAT_TOPIC="/topic/message";
service.CHAT_BROKER="/app.chat";


service.send=function(message)
{
var id=Math.floor(Math.random()*100000);
socket.storm.send(service.CHAT_BROKER,{priority:9},JSON.stringify({message:message,id:}))
messageIds.push(id);     
};

service.receive=function()
{
return listener.promise;	
};

var reconnect=function()
{
$timeout(function()
{initialize()},RECONNECT_TIMEOUT);



};


var getMessage=function(data)
{
	
var message=JSON.parse(data),out={};
out.message=message.message;
out.time=new Date(message.time);
return out;
};

var StartListener=function()
{

	socket.stomp.subscribe(service.CHAT_TOPIC,function(data)
			
	{
		listener.notify(getMessage(data.body));
		
	});
};

var initialize=function()
{
	
console.log('Initialization-Module');
socket.client=new SockJS(service.SOCKET_URL);
socket.stomp=Stomp.over(socket.client);
socket.stomp.connect({},StartListener);
socket.stomp.onClose=reconnect;

};

initialize();
return service;
	
	
	
	
}
}
