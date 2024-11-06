# MongoDB Cheat Sheet

MongoDB is a NoSQL document-oriented database that stores data in JSON-like BSON (Binary JSON) documents. This cheat sheet covers the essential commands and features to help you work efficiently with MongoDB.

---

## Table of Contents

1. **Basic Commands**
    - Connecting to MongoDB
    - Show Databases and Collections
    - Create and Drop Databases/Collections

2. **CRUD Operations**
    - **Create**: `insertOne`, `insertMany`
    - **Read**: `find`, `findOne`
    - **Update**: `updateOne`, `updateMany`, `replaceOne`
    - **Delete**: `deleteOne`, `deleteMany`

3. **Query Operators**
    - Comparison Operators
    - Logical Operators
    - Element Operators
    - Evaluation Operators

4. **Projection**
5. **Sorting and Pagination**
6. **Indexes**
7. **Aggregation Framework**
8. **Transactions**
9. **Miscellaneous Commands**

---

## 1. Basic Commands

### Connecting to MongoDB

```bash
# Connect to MongoDB shell
mongo

# Connect to a specific database
mongo your_database_name
```

### Show Databases and Collections

```javascript
// Show all databases
show dbs;

// Switch to or create a new database
use database_name;

// Show all collections in the current database
show collections;
```

### Create and Drop Databases/Collections

```javascript
// Create a collection (implicitly creates the database if it doesn't exist)
db.createCollection('collection_name');

// Drop a collection
db.collection_name.drop();

// Drop the current database
db.dropDatabase();
```

---

## 2. CRUD Operations

### Create

#### `insertOne`

```javascript
db.collection.insertOne({ key1: 'value1', key2: 'value2' });
```

#### `insertMany`

```javascript
db.collection.insertMany([
  { key1: 'value1' },
  { key1: 'value2' },
]);
```

### Read

#### `find`

```javascript
// Find all documents
db.collection.find({});

// Find documents with a condition
db.collection.find({ key: 'value' });
```

#### `findOne`

```javascript
db.collection.findOne({ key: 'value' });
```

### Update

#### `updateOne`

```javascript
db.collection.updateOne(
  { key: 'value' },           // Filter
  { $set: { key: 'new_value' } } // Update operation
);
```

#### `updateMany`

```javascript
db.collection.updateMany(
  { key: { $gt: 10 } },
  { $inc: { key: 1 } }
);
```

#### `replaceOne`

```javascript
db.collection.replaceOne(
  { key: 'value' },
  { new_key1: 'new_value1', new_key2: 'new_value2' }
);
```

### Delete

#### `deleteOne`

```javascript
db.collection.deleteOne({ key: 'value' });
```

#### `deleteMany`

```javascript
db.collection.deleteMany({ key: { $exists: false } });
```

---

## 3. Query Operators

### Comparison Operators

- `$eq`: Equal to
- `$ne`: Not equal to
- `$gt`: Greater than
- `$gte`: Greater than or equal to
- `$lt`: Less than
- `$lte`: Less than or equal to
- `$in`: In array
- `$nin`: Not in array

**Example:**

```javascript
db.collection.find({ age: { $gte: 18, $lte: 30 } });
```

### Logical Operators

- `$and`: Logical AND
- `$or`: Logical OR
- `$not`: Logical NOT
- `$nor`: Logical NOR

**Example:**

```javascript
db.collection.find({
  $and: [{ status: 'A' }, { qty: { $lt: 30 } }]
});
```

### Element Operators

- `$exists`: Field exists
- `$type`: Field is of specified type

**Example:**

```javascript
db.collection.find({ email: { $exists: true } });
```

### Evaluation Operators

- `$regex`: Regular expression match
- `$mod`: Modulo operation
- `$text`: Text search
- `$where`: JavaScript expression

**Example:**

```javascript
db.collection.find({ name: { $regex: /^A/, $options: 'i' } });
```

---

## 4. Projection

Control which fields are returned in the query result.

```javascript
db.collection.find(
  { status: 'A' },
  { _id: 0, name: 1, status: 1 }
);
```

---

## 5. Sorting and Pagination

### Sorting

```javascript
db.collection.find({}).sort({ key1: 1, key2: -1 });
```

- `1` for ascending order
- `-1` for descending order

### Pagination

```javascript
db.collection.find({}).skip(20).limit(10);
```

- `skip(n)`: Skip the first `n` documents
- `limit(n)`: Limit the result to `n` documents

---

## 6. Indexes

### Create an Index

```javascript
db.collection.createIndex({ key: 1 });
```

### View Indexes

```javascript
db.collection.getIndexes();
```

### Drop an Index

```javascript
db.collection.dropIndex('index_name');
```

---

## 7. Aggregation Framework

Used for complex data aggregation and analysis.

### Basic Aggregation Pipeline

```javascript
db.collection.aggregate([
  { $match: { status: 'A' } },
  { $group: { _id: '$category', total: { $sum: '$amount' } } },
  { $sort: { total: -1 } }
]);
```

### Common Aggregation Stages

- `$match`: Filters documents
- `$group`: Groups documents
- `$sort`: Sorts documents
- `$project`: Reshapes documents
- `$limit`: Limits the number of documents
- `$skip`: Skips documents
- `$unwind`: Deconstructs arrays
- `$lookup`: Performs left outer join

---

## 8. Transactions

Transactions allow multiple operations to be executed in an all-or-nothing manner.

### Start a Session and Transaction

```javascript
const session = db.getMongo().startSession();
session.startTransaction();

try {
  session.getDatabase('db_name').collection('collection_name').insertOne({ ... }, { session });
  session.commitTransaction();
} catch (error) {
  session.abortTransaction();
} finally {
  session.endSession();
}
```

---

## 9. Miscellaneous Commands

### Count Documents

```javascript
db.collection.countDocuments({ status: 'A' });
```

### Distinct Values

```javascript
db.collection.distinct('key', { status: 'A' });
```

### Update Field in All Documents

```javascript
db.collection.updateMany({}, { $set: { updated_at: new Date() } });
```

### Bulk Operations

```javascript
const bulk = db.collection.initializeOrderedBulkOp();
bulk.insert({ ... });
bulk.find({ key: 'value' }).updateOne({ $set: { key: 'new_value' } });
bulk.execute();
```

### Backup and Restore

```bash
# Backup
mongodump --db database_name --out /backup/directory

# Restore
mongorestore --db database_name /backup/directory/database_name
```

---

## Notes

- **Data Types**: MongoDB supports various data types like String, Number, Boolean, Array, Object, Date, Null, etc.
- **BSON Types**: Special data types like ObjectId, Binary Data, Code, Regular Expression.
- **ObjectId**: Unique identifier for documents.

**Example of an ObjectId:**

```javascript
ObjectId("507f1f77bcf86cd799439011");
```

---

## Helpful Tips

- **Use Aliases in Aggregation**: Use the `$project` stage to rename fields.
- **Index Fields Used in Queries**: Improves performance.
- **Avoid `$where` Operator**: It's slower and can pose security risks.

---

## Resources

- **Official Documentation**: [MongoDB Manual](https://docs.mongodb.com/manual/)
- **MongoDB University**: Free online courses to learn MongoDB.

---

**Disclaimer**: This cheat sheet provides a concise overview of MongoDB commands and features. For comprehensive details and advanced usage, refer to the official MongoDB documentation.