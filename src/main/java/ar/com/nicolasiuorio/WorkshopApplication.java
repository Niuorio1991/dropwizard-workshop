package ar.com.nicolasiuorio;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class WorkshopApplication extends Application<WorkshopConfiguration> {

    public static void main(final String[] args) throws Exception {
        new WorkshopApplication().run(args);
    }

    @Override
    public String getName() {
        return "Workshop";
    }

    @Override
    public void initialize(final Bootstrap<WorkshopConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final WorkshopConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
