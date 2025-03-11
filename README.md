# 🎬 Enternflix REST API

🚀 Enternflix REST API is the backend service for the Enternflix streaming platform (a Netflix clone). Built with Spring Boot and Spring Security, this API provides secure and scalable endpoints to support a production-ready application.

## Features

- Fetch movie details from TMDb.
- Store and manage movie data in MongoDB.
- Customizable endpoints to suit your needs.

## Prerequisites

- Java 17 or higher
- Maven 3.8.1 or higher
- MongoDB 4.4 or higher

## Configuration

Create a `application.properties` file in the `src/main/resources` directory with the following content:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/enternflix
tmdb.api.key=your_tmdb_api_key
```

> Replace `your_tmdb_api_key` with your actual TMDb API key.

## Running the Application

To run the application, use the following command:

```bash
mvn spring-boot:run
```

## API Endpoints

| Endpoint             | Method | Description                                          |
| -------------------- | ------ | ---------------------------------------------------- |
| `/movie/create`      | GET    | Adds a new movie to the MongoDB database.            |
| `/movie/delete/{id}` | DELETE | Deletes a movie from the MongoDB database by its ID. |
| `/movie/update/{id}` | PUT    | Updates details of a movie in the MongoDB database.  |

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.

For more information, please refer to the [Official Documentation](https://github.com/xanderbilla/enternflix-api/wiki).
