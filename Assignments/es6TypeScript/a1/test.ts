export{};
console.log('hellow world');

function welcomPerson(person:Person): string{
    console.log(`hey ${person.firstName} ${person.lastName}`);
    return `hey ${person.firstName} ${person.lastName}`;
}

const james ={
    firstName:"john",
    lastName: "rambo"
}
welcomPerson(james);
interface Person {
    firstName :string,
    lastName :string
}