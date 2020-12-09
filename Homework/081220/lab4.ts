const fixed = (e) => {
  return e.toFixed(
    e.toString().split("e")[0].length +
      (isNaN(Math.abs(Number(e.toString().split("e")[1])))
        ? 0
        : Number(e.toString().split("e")[1]) >= 0
        ? 0
        : Math.abs(Number(e.toString().split("e")[1]))) -
      2
  );
};

console.log("----------1a----------");
let num: number = 1000000;
console.log(num.toExponential());
console.log("----------1b----------");
num = 10000000;
console.log(num.toExponential());
console.log("----------1c----------");
num = 43000000000;
console.log(num.toExponential());
console.log("----------1d----------");
num = 0.000012;
console.log(num.toExponential());
console.log("----------1e----------");
num = 0.0000001234;
console.log(num.toExponential());

console.log("----------2a----------");
let expo = 1e10;
console.log(fixed(expo));
console.log("----------2b----------");
expo = 2e5;

console.log(fixed(expo));
console.log("----------2c----------");
expo = 122e8;
console.log(fixed(expo));
console.log("----------2d----------");
expo = 1e-8;
console.log(fixed(expo));
console.log("----------2e----------");
expo = 12e-5;
console.log(fixed(expo));
