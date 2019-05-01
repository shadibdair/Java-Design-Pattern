const countryManager=require('./CountryManager');
const express=require('express');
const app=express();

let sub=new countryManager.CountryManager();
app.use(express.static(__dirname+"view"));

app.get("/read",(req,res)=>{
    res.send(sub.getBestCountry())
});

app.get("/set/:c",(req,res)=>{
    sub.getBestCountry()
    res.send(sub.getBestCountry)
});

app.listen(4000);



// OUTPUT 

// C:\Users\hanan>curl localhost:4000/read
// Israel