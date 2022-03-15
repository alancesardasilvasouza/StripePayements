// const button = document.querySelector("button")
// button.addEventListener("click", async () => {
//     fetch("/create-checkout-session", {
//         method: "POST",
//         headers: {"Content-Type": "application/json"},
//         body: JSON.stringify({
//             items: [{valor}]
//         })
//     }).then((result)=> {console.log(result)})
//         .catch(e =>{
//         console.error(e.error)
//     })
// });
// document.addEventListener('DOMContentLoaded', async () => {
//     let searchParams = new URLSearchParams(window.location.search);
//     if (searchParams.has('session_id')) {
//         const session_id = searchParams.get('session_id');
//         document.getElementById('session-id').setAttribute('value', session_id);
//     }
// });