function meth(){
    const pi=22.8
    console.log(pi);

    pi=230
    console.log(pi);   
}


function meth1(){
    meth()
}

function meth2(){
    try{
        meth1();
    }catch(e){
        console.log(e.name+" "+e.message);
        
    }
}

meth2()