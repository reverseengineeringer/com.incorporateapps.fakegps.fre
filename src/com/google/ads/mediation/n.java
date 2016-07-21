package com.google.ads.mediation;

import com.google.android.gms.internal.zzin;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class n
{
  public final void a(Map paramMap)
  {
    Object localObject1 = new HashMap();
    Object localObject2 = getClass().getFields();
    int j = localObject2.length;
    int i = 0;
    Object localObject3;
    while (i < j)
    {
      localObject3 = localObject2[i];
      p localp = (p)((Field)localObject3).getAnnotation(p.class);
      if (localp != null) {
        ((Map)localObject1).put(localp.a(), localObject3);
      }
      i += 1;
    }
    if (((Map)localObject1).isEmpty()) {
      zzin.zzaK("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject2 = (Map.Entry)paramMap.next();
      localObject3 = (Field)((Map)localObject1).remove(((Map.Entry)localObject2).getKey());
      if (localObject3 != null) {
        try
        {
          ((Field)localObject3).set(this, ((Map.Entry)localObject2).getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          zzin.zzaK("Server option \"" + (String)((Map.Entry)localObject2).getKey() + "\" could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          zzin.zzaK("Server option \"" + (String)((Map.Entry)localObject2).getKey() + "\" could not be set: Bad Type");
        }
      } else {
        zzin.zzaI("Unexpected server option: " + (String)((Map.Entry)localObject2).getKey() + " = \"" + (String)((Map.Entry)localObject2).getValue() + "\"");
      }
    }
    paramMap = new StringBuilder();
    localObject1 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Field)((Iterator)localObject1).next();
      if (((p)((Field)localObject2).getAnnotation(p.class)).b())
      {
        zzin.zzaK("Required server option missing: " + ((p)((Field)localObject2).getAnnotation(p.class)).a());
        if (paramMap.length() > 0) {
          paramMap.append(", ");
        }
        paramMap.append(((p)((Field)localObject2).getAnnotation(p.class)).a());
      }
    }
    if (paramMap.length() > 0) {
      throw new o("Required server option(s) missing: " + paramMap.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */