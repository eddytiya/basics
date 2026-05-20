// Show an Example of Exception Propagation


function meth(){
    const pi=3.14;
    pi=22.7;
}

function meth1(){
    meth();
}

function meth2(){
    try{
        meth1();
    }catch(e){
        console.log(e.name+" "+e.message);
        
    };
}


meth2();