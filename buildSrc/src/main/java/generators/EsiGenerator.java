package generators;


import io.swagger.codegen.SupportingFile;
import io.swagger.codegen.languages.KotlinClientCodegen;

import java.io.File;

public class EsiGenerator extends KotlinClientCodegen {

    @Override
    public void processOpts() {
        super.processOpts();

        final String infrastructureFolder = (sourceFolder + File.separator + packageName + File.separator + "infrastructure").replace(".", "/");

        supportingFiles.add(new SupportingFile("infrastructure/ApiClient.kt.mustache", infrastructureFolder, "ApiClient.kt"));
        supportingFiles.add(new SupportingFile("infrastructure/ServiceBuilder.kt.mustache", infrastructureFolder, "ServiceBuilder.kt"));
        supportingFiles.add(new SupportingFile("infrastructure/AccessToken.kt.mustache", infrastructureFolder, "AccessToken.kt"));

    }
}