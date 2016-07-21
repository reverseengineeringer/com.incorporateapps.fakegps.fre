package com.google.android.gms.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;

public final class zza
{
  private static volatile zza zzaUe;
  private final String zzaUa;
  private final Status zzaUb;
  private final boolean zzaUc;
  private final boolean zzaUd;
  
  zza(Context paramContext)
  {
    paramContext = paramContext.getResources();
    String str = paramContext.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    int i = paramContext.getIdentifier("google_app_measurement_enable", "integer", str);
    if (i != 0) {
      if (paramContext.getInteger(i) != 0)
      {
        bool1 = true;
        if (bool1) {
          break label111;
        }
        label52:
        zzaUd = bool2;
        label58:
        zzaUc = bool1;
        i = paramContext.getIdentifier("google_app_id", "string", str);
        if (i != 0) {
          break label135;
        }
        if (!zzaUc) {
          break label125;
        }
      }
    }
    label111:
    label125:
    for (zzaUb = new Status(10, "Missing an expected resource: 'R.string.google_app_id' for initializing Google services.  Possible causes are missing google-services.json or com.google.gms.google-services gradle plugin.");; zzaUb = Status.zzagC)
    {
      zzaUa = null;
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label52;
      zzaUd = false;
      break label58;
    }
    label135:
    paramContext = paramContext.getString(i);
    if (TextUtils.isEmpty(paramContext))
    {
      if (zzaUc) {}
      for (zzaUb = new Status(10, "The resource 'R.string.google_app_id' is invalid, expected an app  identifier and found: '" + paramContext + "'.");; zzaUb = Status.zzagC)
      {
        zzaUa = null;
        return;
      }
    }
    zzaUa = paramContext;
    zzaUb = Status.zzagC;
  }
  
  zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    zzaUa = paramString;
    zzaUb = Status.zzagC;
    zzaUc = paramBoolean;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      zzaUd = paramBoolean;
      return;
    }
  }
  
  public static String zzAp()
  {
    if (zzaUe == null) {
      try
      {
        if (zzaUe == null) {
          throw new IllegalStateException("Initialize must be called before getGoogleAppId.");
        }
      }
      finally {}
    }
    return zzaUe.zzAq();
  }
  
  public static boolean zzAr()
  {
    if (zzaUe == null) {
      try
      {
        if (zzaUe == null) {
          throw new IllegalStateException("Initialize must be called before isMeasurementEnabled.");
        }
      }
      finally {}
    }
    return zzaUe.zzAt();
  }
  
  public static boolean zzAs()
  {
    if (zzaUe == null) {
      try
      {
        if (zzaUe == null) {
          throw new IllegalStateException("Initialize must be called before isMeasurementExplicitlyDisabled.");
        }
      }
      finally {}
    }
    return zzaUezzaUd;
  }
  
  public static Status zzaR(Context paramContext)
  {
    zzx.zzb(paramContext, "Context must not be null.");
    if (zzaUe == null) {}
    try
    {
      if (zzaUe == null) {
        zzaUe = new zza(paramContext);
      }
      return zzaUezzaUb;
    }
    finally {}
  }
  
  public static Status zzb(Context paramContext, String paramString, boolean paramBoolean)
  {
    zzx.zzb(paramContext, "Context must not be null.");
    zzx.zzh(paramString, "App ID must be nonempty.");
    try
    {
      if (zzaUe != null)
      {
        paramContext = zzaUe.zzeu(paramString);
        return paramContext;
      }
      zzaUe = new zza(paramContext, paramString, paramBoolean);
      return zzaUezzaUb;
    }
    finally {}
  }
  
  final String zzAq()
  {
    return zzaUa;
  }
  
  final boolean zzAt()
  {
    return (zzaUb.isSuccess()) && (zzaUc);
  }
  
  final Status zzeu(String paramString)
  {
    if ((zzaUa != null) && (!zzaUa.equals(paramString))) {
      return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + zzaUa + "'.");
    }
    return Status.zzagC;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */