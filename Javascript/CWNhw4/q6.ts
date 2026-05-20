// Demonstrate example for generic in function.


function demo <T>(a:T):T{
    return a;
}

console.log(demo <number> (10));
console.log(demo <boolean> (true));

