window.onload=function(){
    let mycar=document.querySelectorAll(".mycar"); //배열타입

    //0번 이미지 이벤트
    //마우스를 올리면 ../photo/K-052.png로 변경 벗어나면 다시 원래이미지
   
            let Photo="";
            mycar[0].onmouseover=function(){

                //마우스가 위치한 곳의 이미지를 얻기
                Photo=this.getAttribute("src");

                //새로운 이미지로 변경
                this.setAttribute("src","../photo/K-052.png");
            }
            mycar[0].onmouseout=function(){
                
                this.setAttribute("src",Photo);

            }

    //1번 이미지 이벤트
    //마우스를 올리면 border 를 설정 벗어나면 초기화

        mycar[1].onmouseover=function(){

            //mycar[1].style.border="3px solid orange";
            this.style.borderStyle="inset";
            this.style.borderWidth="10px";
            this.style.borderColor="orange";

        }
        mycar[1].onmouseout=function(){

            // mycar[1].style.border="none";
            this.style.border="none";
        }

    //2번 이미지 이벤트
    //마우스를 올리면 .happy를 적용하고 벗어나면 다시 없애기?
    //.happy 는 미리 만들어 둘것?(내용상관없음)
    mycar[2].onmouseover=function(){

          this.setAttribute("class","mycar happy")

        }
        mycar[2].onmouseout=function(){

            this.setAttribute("class","mycar")

        }


}