var CountryManager = /** @class */ (function () {
    function CountryManager() {
        this.bestCountry = "Israel";
    }
    CountryManager.prototype.getBestCountry = function () {
        return this.bestCountry;
    };
    CountryManager.prototype.setBestCountry = function (x) {
        this.bestCountry = x;
    };
    return CountryManager;
}());
;
module.exports = {
    CountryManager: CountryManager
};
