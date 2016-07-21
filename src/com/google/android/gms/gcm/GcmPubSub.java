package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GcmPubSub
{
  private static GcmPubSub zzaLE;
  private static final Pattern zzaLG = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
  private InstanceID zzaLF;
  
  private GcmPubSub(Context paramContext)
  {
    zzaLF = InstanceID.getInstance(paramContext);
  }
  
  public static GcmPubSub getInstance(Context paramContext)
  {
    try
    {
      if (zzaLE == null) {
        zzaLE = new GcmPubSub(paramContext);
      }
      paramContext = zzaLE;
      return paramContext;
    }
    finally {}
  }
  
  public void subscribe(String paramString1, String paramString2, Bundle paramBundle)
  {
    if ((paramString1 == null) || (paramString1.isEmpty())) {
      throw new IllegalArgumentException("Invalid appInstanceToken: " + paramString1);
    }
    if ((paramString2 == null) || (!zzaLG.matcher(paramString2).matches())) {
      throw new IllegalArgumentException("Invalid topic name: " + paramString2);
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putString("gcm.topic", paramString2);
    zzaLF.getToken(paramString1, paramString2, localBundle);
  }
  
  public void unsubscribe(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("gcm.topic", paramString2);
    zzaLF.zzb(paramString1, paramString2, localBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.GcmPubSub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */