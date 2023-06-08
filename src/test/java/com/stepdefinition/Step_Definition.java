package com.stepdefinition;

import java.util.List;

import org.bson.BsonDocument;
import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Step_Definition {
//	RequestSpecification given;
	Response response;
	String Uri="mongodb://localhost:27017";
	@Given("Hit the uri")
	public void hit_the_uri() {
		
//		RestAssured.baseURI="https://api.github.com/";
//		Response post = RestAssured.given().auth().preemptive().oauth2("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").
//		body("{\"name\":\"Hello-July\",\"description\":\"This is your first repo!\",\"homepage\":\"https://github.com\",\"private\":false,\"is_template\":true}").
//		when().post("user/repos");
//		int statusCode = post.statusCode();
//		System.out.println(statusCode);
//		
//		Response response2 = RestAssured.given().auth().preemptive().oauth2("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").when().
//		get("user/repos");
//		System.out.println(response2.statusCode());
//		System.out.println(response2.asPrettyString());
		
//		Response put = RestAssured.given().auth().preemptive().oauth2("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").
//				body("\"description\":\"This is your first repo!\"")
//		.when().patch("repos/{sharansk93}/{Hello-July}");
//		System.out.println(put.statusCode());
//		System.out.println(put.asPrettyString());
//		
		MongoClient client = MongoClients.create(Uri);
		MongoIterable<String> listDatabaseNames = client.listDatabaseNames();
		for (String string : listDatabaseNames) {
			System.out.println(listDatabaseNames.toString());
		}
		MongoDatabase database = client.getDatabase("mydb");
		MongoCollection<Document> collection = database.getCollection("Employee");
		FindIterable<Document> find = database.getCollection("Employee").find();
		for (Document document : find) {
			System.out.println(document);
		}
		
//		BsonDocument asDocument = collection.getReadConcern().asDocument();
//		System.out.println(asDocument);
		
		
	}

	@When("I post the get request and get the status code and the last name of last id")
	public void i_post_the_get_request_and_get_the_status_code_and_the_last_name_of_last_id() {

	}

	@Then("validate the status code")
	public void validate_the_status_code() {

	    
	}

}
