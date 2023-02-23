const submit = document.querySelector('#submit');


const saveLead = async() => {
    let clientName = document.getElementByID("recipient-name").value
    let mobile = document.getElementByID("mobile").value

 let response = await fetch('http://localhost:8081/api/leads');
 let response2 = await fetch('http://localhost:8081/api/lead',  {
 method: 'POST',
 headers: {
    'Accept': 'application/json',
    'Content-Type' : 'application/json'
 },
 body: JSON.stringify({
    user_Name: "madhu ",
    email: "madhu@gmail.com ",
    password: "123456 "
 })
})
 console.log(response);
 console2.log(response);
}

submit.addEventListener('click', saveLead);