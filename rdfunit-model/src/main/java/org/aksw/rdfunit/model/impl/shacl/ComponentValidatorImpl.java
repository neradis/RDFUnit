package org.aksw.rdfunit.model.impl.shacl;

import com.google.common.collect.ImmutableList;
import lombok.*;
import org.aksw.rdfunit.enums.ComponentValidatorType;
import org.aksw.rdfunit.model.interfaces.shacl.ComponentValidator;
import org.apache.jena.rdf.model.Resource;

import java.util.Optional;

@ToString
@EqualsAndHashCode(exclude={"element"})
@Builder
public class ComponentValidatorImpl implements ComponentValidator {
    @Getter @NonNull private final Resource element;
    @Getter private final String message;
    @Getter @NonNull private final String sparqlQuery;
    @Getter @NonNull private final ComponentValidatorType type;
    @Getter @NonNull private ImmutableList<String> filters;

    @Override
    public Optional<String> getDefaultMessage() {
        return Optional.ofNullable(message);
    }

}
