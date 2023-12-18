//var db = connect("mongodb://admin:password@localhost:27017/admin");

db = db.getSiblingDB('db-fiap-fastfood');

db.createUser(
    {
        user: "admin",
        pwd: "password",
        roles: [
            {
                role: "readWrite",
                db: "db-fiap-fastfood"
            }
        ]
    }
)

db.createCollection("attendant");
db.createCollection("client");
db.createCollection("order");
db.createCollection("product");
db.createCollection("payment");

//db.followers.insertMany([
//    {
//            userId: 1,
//            followerId: 2,
//            followerUsername: "name1"
//    },
//    {
//            userId: 1,
//            followerId: 3,
//            followerUsername: "name2"
//    }
//]);
//
//db.following.insertMany([
//    {
//            userId: 3,
//            followingId: 1,
//            followingUsername: "name3"
//    },
//    {
//            userId: 4,
//            followingId: 2,
//            followingUsername: "name4"
//    }
//]);
