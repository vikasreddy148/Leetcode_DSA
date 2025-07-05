/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function(arr) {
    const map = new Map();
     
        arr.forEach(num => {
            map.set(num, (map.get(num) || 0) + 1);
        });

        let max = -1;
        for (const [key, value] of map.entries()) {
            if (key === value) {
                max = Math.max(max, key);
            }
        }

        return max;
    
};