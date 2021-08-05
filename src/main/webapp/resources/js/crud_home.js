/**
 * 
 */
 

const btn = document.getElementById("btn");
const list = document.getElementById("display");

btn.addEventListener('click', () => {
	const xhttp = new XMLHttpRequest();
	
	xhttp.addEventListener('readystatechange', (e) =>{
		const target = e.target;
		const status = target.status;
		const readyState = target.readyState;
		
		if (status == 200 && readyState == 4) {
			myobj = JSON.parse(target.responseText);
			Object.keys(myobj).forEach((key) => {
				const new_node = document.createElement("h4");
				new_node.innerHTML = myobj[key];
				list.appendChild(new_node);
			});
		}
	});
	xhttp.open('GET', '/rest/sample/getsample', true);
	
	xhttp.send();
});