/**
 * 
 */
const to_print = document.querySelector("#test > h4");

function loadStr() {
	
	// 1. 비동기 요청 인스턴스를 생성한다.
	const xhttp = new XMLHttpRequest();
	
	// 2. 비동기 요청을 설정한다
	xhttp.onreadystatechange = (e) => {
		const target = e.target;
	    const readyState = e.target.readyState;
	    const httpStatus = e.target.status;
		
		console.log(target);
		console.log('readyState: ', readyState);
		if (httpStatus == 200) {
			if (readyState == 1) {
				console.log("서버와의 연결이 수립되었습니다");
			} else if (readyState == 2) {
				console.log("서버가 당신의 요청을 받았습니다");
			} else if (readyState == 3) {
				console.log("요청을 처리중입니다");
			} else if (readyState == 4) {
				console.log("요청 처리가 끝난 후 응답이 준비되었습니다");
			} else {
				console.log("요청이 아직 생성되지 않았거나 뭔가 잘못되었습니다");
			}
		}
	};
	/*xhttp.addEventListener('readystatechange', (e) =>{
		console.log(e,reayState);
		to_print.innerHTML = e.target.responseText;
	});*/
	xhttp.open('GET', '/rest/sample/getstr', true);
	
	// 3. 요청을 보낸다
	xhttp.send();
};
const sampleAsyncBtn = document.getElementById("sampleAsyncBtn");
const list = document.getElementById("testlist");

sampleAsyncBtn.addEventListener('click', () => {
	const xhttp = new XMLHttpRequest();
	
	xhttp.addEventListener('readystatechange', (e) =>{
		const target = e.target;
		const status = target.status;
		const readyState = target.readyState;
		
		if (status == 200 && readyState == 4) {
			myobj = JSON.parse(target.responseText);
			Object.keys(myobj).forEach((key) => {
				const new_node = document.createElement("li");
				new_node.innerHTML = myobj[key];
				list.appendChild(new_node);
			});
		}
	});
	xhttp.open('GET', '/rest/sample/getsample', true);
	
	xhttp.send();
});

const asyncJsonDataBtn = document.getElementById("asyncJsonDataBtn");

asyncJsonDataBtn.addEventListener('click', () => {
   const xhttp = new XMLHttpRequest();
   
   xhttp.addEventListener('readystatechange', (e) => {
      const target = e.target;
      const status = target.status;
      const readyState = target.readyState;
      
      if(status == 200 && readyState == 4) {
         to_print.innerHTML = target.responseText;
      }
   });
   
   myFruit = {
      'name': 'pineapple',
      'price': 4500,
      'calorie' : 800
   };
   
   // GET방식으로 데이터를 보낼 때는 open() 메서드의 URI 뒤에 데이터를 붙여서 전송한다
   // POST방식으로 데이터를 보낼 때는 send() 메서드의 매개변수로 데이터를 전송한다
   xhttp.open('POST', '/rest/sample/fruit', true);
   xhttp.setRequestHeader('content-type', 'application/json;charset=utf-8');
   
   // 자바스크립트 오브젝트는 아주 손쉽게 JSON형식 문자열로 변환될 수 있다
   xhttp.send(JSON.stringify(myFruit));
   
});























