const express = require("express")
const mysql = require("mysql")

// DB Info 
const db = mysql.createConnection({
    host:"localhost",
    user : "root",
    password : "sreej@02",
    database : "ffi"

})

db.connect((err)=>{
    if(err)
    throw err;

    console.log("MYSQL Connection Successfull....")
    db.query("select * from user",function(err,result,fields){
            if(err)
                throw err;
            console.log(result)
    })

    db.query("insert into user(userID,username,password) values(103,'Nandu','Nandu')",function(err,result){
        if(err)
        throw err;
        console.log(result + " inserted...")
    })
})