package com.google.android.gms.nearby.messages.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

public class zzj
{
  public static Parcelable zzc(Intent paramIntent, String paramString)
  {
    paramIntent = paramIntent.getBundleExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getParcelable(paramString);
  }
  
  public static List zzd(Intent paramIntent, String paramString)
  {
    paramIntent = paramIntent.getBundleExtra(paramString);
    if (paramIntent == null) {
      return Collections.emptyList();
    }
    return paramIntent.getParcelableArrayList(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */