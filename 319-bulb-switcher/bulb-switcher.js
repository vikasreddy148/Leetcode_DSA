/**
 * @param {number} n
 * @return {number}
 */
var bulbSwitch = function(n) {
    let res = 0;
    for(let i=1;i<=n;i++){
        if(isPerfectSquare(i)){
            res++;
        }
    }

    function isPerfectSquare(n){
        let sqr = Math.sqrt(n);
        return sqr === Math.floor(sqr)
    }
    return res;
};