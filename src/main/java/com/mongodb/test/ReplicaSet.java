package com.mongodb.test;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class ReplicaSet {

	public static void main(String[] args) {
		/*
		List<ServerAddress> seeds = new ArrayList<ServerAddress>();
		seeds.add(new ServerAddress("127.0.0.1", 28010));
		seeds.add(new ServerAddress("127.0.0.1", 28011));
		seeds.add(new ServerAddress("127.0.0.1", 28012));
		
		List<MongoCredential> cretList = new ArrayList<MongoCredential>();
		cretList.add(MongoCredential.createCredential("dba", "admin", "dba".toCharArray()));
		
		MongoClient client = new MongoClient(seeds,cretList);
		
		MongoDatabase test = client.getDatabase("test");
		
		 FindIterable<Document> iter = test.getCollection("c1").find();
		
		 iter.forEach(new Block<Document>() {
			    @Override
			    public void apply(final Document document) {
			        System.out.println(document);
			    }
		});
		 
		
		 
		test.getCollection("c1").insertOne(new Document("test", "test"));
		
		
		
		 for(Document d : test.getCollection("c1").find()){
			 System.out.println(d);
		 }
		 
		 
		 */
		 
	}

}
