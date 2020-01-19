package org.immersed;

import java.nio.file.*;

public final class Constants
{
    public static final Path HOME = Paths.get("C:", "ProgramData", "DigitalFood");

    public static final Path SOURCE_FOLDER = Paths.get("src", "main", "java");

    public static final String PACKAGE = "org.immersed.fooddatacentral";

    public static final String generated(String pkg)
    {
        return pkg + ".generated";
    }

    public static final Path resolve(Path root, String pck)
    {
        Path path = root;

        for (String folder : pck.split("[.]"))
        {
            path = path.resolve(folder);
        }

        return path;
    }

    private Constants()
    {
    }
}
