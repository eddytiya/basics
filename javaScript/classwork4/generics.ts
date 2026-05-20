function add<T>(a:T):T{
    return a;
}

console.log(add<String>("aditya"));
console.log(add<number>(123));
