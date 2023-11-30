# Spring_GraphQL-Kotlin_trial

- prepare Java 21
- `./gradlew bootRun`
- post the following data to `localhost:8080/graphql`
  ```
  query {
    findById(id: 1){
        id
    }
  }
  ```
