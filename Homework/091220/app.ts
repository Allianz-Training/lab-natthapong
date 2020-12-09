import { idCardInterfaces } from "./idCardInterfaces";
import { subject } from "./interfaces2";

console.log("---1---");

let base10Arr: Array<number> = [100, 111, 55, 21, 99];
console.log("----------1----------");
console.log(base10Arr.map((value) => value.toString(8)));

console.log("----------2----------");
console.log(base10Arr.map((v) => v.toString(16)));

console.log("----------3----------");
let floatArr: Array<number> = [12.423, 31313.135, 42.809];
console.log(floatArr.map((value) => Math.round(value)));

console.log("\n---2---");
const random = (min: number, max: number) => {
  return Math.random() * (max - min) + min;
};
console.log(random(10, 13));

console.log("\n---3---");
console.log("----------1----------");
let A: boolean = false,
  B: boolean = true,
  C: boolean = false;
console.log("----------2----------");
console.log(A || (B && C));
console.log("----------3----------");
console.log(B || A || C);
console.log("----------4----------");
console.log(B && (A || C));

console.log("\n---4---");
console.log("----------1----------");
let typeOfArr: Array<any> = [false, "ABD", 113113, null, "", "13qed"];
console.log(typeOfArr.map((v) => typeof v));
//console.log(typeof test);

console.log("\n---5---");
console.log("----------1----------");
let student: any = {
  name: "NAME",
  isGraduate: true,
  age: 23,
  likes: {
    a: "a",
    b: "b",
    c: "c",
  },
  someArray: [1, 2, 3, 4],
};
console.log(student);

console.log("----------2----------");
let student2: any = Object.assign({}, student);
student2["likes"] = null;
console.log(student2);

console.log("----------3----------");
for (let key in student2) {
  console.log(key, student2[key]);
}
// for (let value of student2) {
//   console.log(value);
// }

console.log("----------4----------");
student.isActive = true;
console.log(student);

console.log("----------5----------");
delete student.isActive;
console.log(student);

console.log("\n---6---");
console.log("----------1----------");
let fruits = ["Apples", "Pear", "Orange"];
let shoppingCart = fruits;
shoppingCart.push("Banana");
console.log(fruits);

console.log("\n---7---");
console.log("----------1----------");
let str: string = "Apple, Cat, Zoo, Bird, Dog";
let input: Array<string> = str.split(", ").sort();
console.log(input);
console.log("----------2----------");
let numArr: Array<number> = [123, 132, 423, 423, 12345, 5343, 52, 10904, 64];
console.log(numArr.filter((v) => v.toString().charAt(0) === "1"));

console.log("----------3----------");
let fruitArr: Array<string> = ["Apple", "Mango", "Cat", "Banana"];
fruitArr.splice(2, 1, "Orange");
fruitArr.sort();
console.log(fruitArr);

console.log("\n---8---");
console.log("----------1----------");
const rectangleArea = (width: number, height: number) => width * height;
const primeNumber = (prime: number) => {
  let isPrime: boolean = true;
  for (let divider: number = 2; divider < Math.sqrt(prime); divider++) {
    if (prime % divider == 0) {
      isPrime = false;
      break;
    }
  }
  if (isPrime) {
    return prime + " is prime number.";
  } else {
    return prime + " is not prime number.";
  }
};
console.log(rectangleArea(16, 20));
console.log(primeNumber(41));
console.log(primeNumber(412));

console.log("\n---9---");
console.log("----------1----------");
let idCards: idCardInterfaces = {
  name: "abc",
  id: "123456789",
};
const print = (obj: idCardInterfaces): void => {
  console.log(obj.name);
  console.log(obj);
};
print(idCards);

console.log("----------2----------");
let test2: subject = { name: "English", data: { id: "12345", weight: 3 } };
const print2 = (obj: subject): void => {
  console.log(obj.data);
  console.log(obj);
};
print2(test2);
