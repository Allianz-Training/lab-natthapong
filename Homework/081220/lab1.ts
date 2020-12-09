let str: string = "STRing";
console.log("----------01----------");
console.log(str.length);
console.log("----------02----------");
for (let index = 0; index < str.length; index++) {
  console.log(str.charAt(index));
}
console.log("----------03----------");
for (let index = 0; index < str.length; index++) {
  console.log(str[index]);
}
console.log("----------04----------");
console.log(str[999]);
console.log(str.charAt(999));
console.log("----------05----------");
console.log("Hello" + " " + "world");
