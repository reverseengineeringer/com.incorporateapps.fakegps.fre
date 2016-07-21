package com.google.android.gms.measurement;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzb
  implements zzi
{
  private static final Uri zzaUf;
  private final LogPrinter zzaUg = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    zzaUf = localBuilder.build();
  }
  
  public final void zzb(zzc paramzzc)
  {
    Object localObject = new ArrayList(paramzzc.zzAv());
    Collections.sort((List)localObject, new zzb.1(this));
    paramzzc = new StringBuilder();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((zze)((Iterator)localObject).next()).toString();
      if (!TextUtils.isEmpty(str))
      {
        if (paramzzc.length() != 0) {
          paramzzc.append(", ");
        }
        paramzzc.append(str);
      }
    }
    zzaUg.println(paramzzc.toString());
  }
  
  public final Uri zziA()
  {
    return zzaUf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */