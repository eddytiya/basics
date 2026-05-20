const mysql = require("mysql");

const db= mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"",
    database:"test"
})

db.connect((error,result)=>{
    if(error){
        console.log(error); 
    }else{
        console.log("connection successful");
        
    }
})

function insert_data(id,name){
    const user={id,name};
    db.query("insert into employee set ?",[user],(error,result)=>{
        if(error){
            console.log(error);
            
        }else{
            console.log("inserted successfully");
            
        }
    })
}

// insert_data(2,"angakrish");




function update_emp(id,name){
    db.query("update employee set name =? where id=?",[name,id],(error,result)=>{
        if(error){
        console.log(error);
        
    }else{
        console.log("updated successfully");
        
    }
    });

    
}

function delete_emp(id){
    db.query("delete from employee where id=?",[id],(error,result)=>{
        if(error){
            console.log(error);
            
        }else{
            console.log("deleted succesfully");
            
        }
    })
}

function show(){
    db.query("select * from employee",(error,result)=>{
        if(error){
            console.log(error);
            
        }else{
            console.log(result);
            
        }
    })
}
// update_emp(2,"aditya part2");
delete_emp(2);
show()