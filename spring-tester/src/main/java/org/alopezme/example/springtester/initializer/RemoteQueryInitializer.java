package org.alopezme.example.springtester.initializer;

import org.alopezme.example.springtester.model.Book;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(
        includeClasses = {
                Book.class
        },
        schemaFileName = "book.proto",
        schemaFilePath = "proto/",
        schemaPackageName = "org.alopezme.springtester")
public interface RemoteQueryInitializer extends SerializationContextInitializer {
}