// Show an Example of Finally Block



try{
    const pi =22.7;

    pi=3.14;
}catch(e){
    console.log(e.name+" "+e.message);
    
}finally{
    console.log("this block executes no matter what so the value of pi is dual");
    
}