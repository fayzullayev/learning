const crypto = require('crypto');

const input = process.argv[2];

const hash = crypto.createHash('sha256').update(input).digest('hex');

console.log(hash);


// f2f29212932e798dd936eafd934feb3fea59ff373530790b556ab53622461921
