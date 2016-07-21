package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;

public final class zzbn
{
  public static IntentFilter zza(String paramString, Uri paramUri, int paramInt)
  {
    paramString = new IntentFilter(paramString);
    if (paramUri.getScheme() != null) {
      paramString.addDataScheme(paramUri.getScheme());
    }
    if (paramUri.getAuthority() != null) {
      paramString.addDataAuthority(paramUri.getAuthority(), Integer.toString(paramUri.getPort()));
    }
    if (paramUri.getPath() != null) {
      paramString.addDataPath(paramUri.getPath(), paramInt);
    }
    return paramString;
  }
  
  public static IntentFilter zzgM(String paramString)
  {
    paramString = new IntentFilter(paramString);
    paramString.addDataScheme("wear");
    paramString.addDataAuthority("*", null);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */