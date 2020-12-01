let array1 = [1, 2, 30, 400];
let array2 = [1, 2, 3, 4];
let array3 = [1, "1", 2, {}];
let array4 = ["apple", "banana", "orange", "pineapple", "watermelon"];
let array5 = [
  { name: "apple", age: 14 },
  { name: "banana", age: 18 },
  { name: "watermelon", age: 32 },
  { name: "pineapple", age: 16 },
  { name: "peach", age: 24 },
];
let array6 = [
  { name: "apple", age: 14 },
  { name: "banana", age: 18 },
  { name: "watermelon", age: 32 },
  { name: "pineapple", age: 16 },
  { name: "peach", age: 24 },
];
let array7 = [1, -3, 2, 8, -4, 5];
let array8 = [1, 3, 4, 5, 6, 7, 8];
let array9 = ["peach", 1, -3, "2", {}, []];
let array10 = ["APPLE", "appLE", "PEACH", "PEach"];
let array11 = [
  { name: "apple", birth: "2001-01-01" },
  { name: "banana", birth: "1990-10-10" },
  { name: "watermelon", birth: "1985-12-30" },
  { name: "peach", birth: "2002-10-13" },
];
let array12 = [
  { name: "apple", birth: "2001-01-01" },
  { name: "banana", birth: "1990-10-10" },
  { name: "watermelon", birth: "1985-12-30" },
  { name: "peach", birth: "2002-10-13" },
];

console.log("-----2.1-----");
console.log(array1.filter((value) => value > 10));

console.log("-----2.2-----");
console.log(array2.filter((value) => value % 2 != 0));

console.log("-----2.3-----");
console.log(array3.filter((value) => typeof value == "number"));

console.log("-----2.4-----");
console.log(array4.filter((value) => value.length > 6));

console.log("-----2.5-----");
console.log(array5.filter((value) => value.age < 18));

console.log("-----2.6-----");
console.log(array6.filter((value) => value.age != 32));

console.log("-----2.7-----");
console.log(array7.filter((value) => value > 0));

console.log("-----2.8-----");
console.log(array8.filter((value) => value % 3 == 0));

console.log("-----2.9-----");
console.log(array9.filter((value) => typeof value == "string"));

console.log("-----2.10-----");
console.log(array10.filter((value) => value.toUpperCase() == value));

console.log("-----2.11-----");
console.log(array11.filter((value) => value.birth.split("-")[1] == "10"));

console.log("-----2.12-----");
console.log(array12.filter((value) => value.birth.split("-")[0] < 2000));
