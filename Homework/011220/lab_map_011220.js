let array1 = [1, 2, 30, 400];
let array2 = [1, 2, 3, 4];
let array3 = [1, "1", 2, {}];
let array4 = ["apple", "banana", "orange"];
let array5 = [
  { name: "apple", age: 14 },
  { name: "banana", age: 18 },
  { name: "watermelon", age: 32 },
];
let array6 = [
  { name: "apple", age: 14 },
  { name: "banana", age: 18 },
  { name: "watermelon", age: 32 },
];
let array7 = [
  { name: "apple", surname: "London" },
  { name: "banana", surname: "Bangkok" },
  { name: "watermelon", surname: "Singapore" },
];
let array8 = [1, 3, 4, 5, 6, 7, 8];
let array9 = [1, -3, 2, 8, -4, 5];
let array10 = [100, 200.25, 300.84, 400.3];
let array11 = [
  { name: "apple", birth: "2000-01-01" },
  { name: "banana", birth: "1990-10-01" },
  { name: "watermelon", birth: "1985-12-01" },
];
let array12 = [
  { name: "apple", birth: "2000-01-01" },
  { name: "banana", birth: "1990-10-10" },
  { name: "watermelon", birth: "1985-12-30" },
];

console.log("-----1.1-----");
console.log(array1.map((value) => value * 2));

console.log("-----1.2-----");
console.log(array2.map((value) => value.toString()));

console.log("-----1.3-----");
console.log(array3.map((value) => typeof value));

console.log("-----1.4-----");
console.log(array4.map((value) => value.toUpperCase()));

console.log("-----1.5-----");
console.log(array5.map((value) => value.name));

console.log("-----1.6-----");
console.log(array6.map((value) => value.age));

console.log("-----1.7-----");
console.log(array7.map((value) => value.name + " " + value.surname));

console.log("-----1.8-----");
console.log(array8.map((value) => (value % 2 == 0 ? "even" : "odd")));

console.log("-----1.9-----");
console.log(array9.map((value) => Math.abs(value)));

console.log("-----1.10-----");
console.log(array10.map((value) => value.toFixed(2).toString()));

console.log("-----1.11-----");
console.log(
  array11.map((value) => {
    let birthday = new Date(value.birth);
    let dateDiff = Date.now() - birthday;
    value["age"] = parseInt(
      (dateDiff / (1000 * 60 * 60 * 24 * 365)).toFixed(0)
    );
    return value;
  })
);

console.log("-----1.12-----");
console.log(
  array12.map((value) => {
    let month = {
      "01": "jan",
      "02": "feb",
      "03": "mar",
      "04": "apr",
      "05": "may",
      "06": "jun",
      "07": "jul",
      "08": "aug",
      "09": "sep",
      10: "oct",
      11: "nov",
      12: "dec",
    };
    let dateArr = value.birth.split("-");
    let newDate = dateArr[2] + " " + month[dateArr[1]] + " " + dateArr[0];
    return `<tr>  <td>${value.name}</td>  <td>${newDate}</td>  </tr>`;
  })
);
