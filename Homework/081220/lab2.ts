let excel: string = "microsoft excel";
let gg: string = "GOOGLE AND APPLE";
let hw: string = "hello world";

console.log("----------01----------");
console.log(excel.toUpperCase());
console.log("----------02----------");
console.log(gg.toLowerCase());
console.log("----------03----------");
console.log(
  `${hw[0].toUpperCase()}${hw.substr(1, 4)} ${hw[6].toUpperCase()}${hw.substr(
    7,
    4
  )}`
);
