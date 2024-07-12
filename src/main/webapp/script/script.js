/*======Menú Hamburguesa-Nav bar=====*/
const buttom = document.querySelector('.icon-menu')
const menuItems = document.querySelector('.responsive-menu')
const buttomX=document.querySelector('.icon-menu-x')

buttom.addEventListener('click',(event)=>{
    event.preventDefault();//se recargaba el navegador visualizando el menu muy poco tiempo,desaparecía,esto lo evita
    menuItems.classList.add('active');//No utilizo .toggle porque me recarga el navegador tras cada cambio de icono menu
    buttomX.classList.add('animadoX');
    buttom.classList.add('animado')})



 buttomX.addEventListener('click',(event)=>{
    event.preventDefault();
    menuItems.classList.remove('active');
    buttomX.classList.remove('animadoX');
    buttom.classList.remove('animado')})