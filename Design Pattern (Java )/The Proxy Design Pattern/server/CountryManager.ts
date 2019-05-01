class CountryManager implements ICountry{
    private bestCountry = "Israel";
    
    public getBestCountry():string{
        return this.bestCountry;
    }

    public setBestCountry(x:string):void{
        this.bestCountry=x;
    }

};

module.exports={
    CountryManager
}