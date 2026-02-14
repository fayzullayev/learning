export function connectToDatabase() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(true);
      console.log("Connected to database.....");
    }, 1000);
  });
}
