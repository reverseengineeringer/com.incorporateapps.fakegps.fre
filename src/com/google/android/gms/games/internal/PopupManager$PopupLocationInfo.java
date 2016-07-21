package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class PopupManager$PopupLocationInfo
{
  public int bottom = 0;
  public int gravity;
  public int left = 0;
  public int right = 0;
  public int top = 0;
  public IBinder zzaFL;
  public int zzaFM = -1;
  
  private PopupManager$PopupLocationInfo(int paramInt, IBinder paramIBinder)
  {
    gravity = paramInt;
    zzaFL = paramIBinder;
  }
  
  public final Bundle zzxg()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("popupLocationInfo.gravity", gravity);
    localBundle.putInt("popupLocationInfo.displayId", zzaFM);
    localBundle.putInt("popupLocationInfo.left", left);
    localBundle.putInt("popupLocationInfo.top", top);
    localBundle.putInt("popupLocationInfo.right", right);
    localBundle.putInt("popupLocationInfo.bottom", bottom);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.PopupManager.PopupLocationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */