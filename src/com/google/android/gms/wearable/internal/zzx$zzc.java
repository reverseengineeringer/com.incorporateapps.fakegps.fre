package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import java.io.IOException;
import java.io.InputStream;

public class zzx$zzc
  implements DataApi.GetFdForAssetResult
{
  private volatile boolean mClosed = false;
  private final Status zzUX;
  private volatile InputStream zzbsh;
  private volatile ParcelFileDescriptor zzbsx;
  
  public zzx$zzc(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    zzUX = paramStatus;
    zzbsx = paramParcelFileDescriptor;
  }
  
  public ParcelFileDescriptor getFd()
  {
    if (mClosed) {
      throw new IllegalStateException("Cannot access the file descriptor after release().");
    }
    return zzbsx;
  }
  
  public InputStream getInputStream()
  {
    if (mClosed) {
      throw new IllegalStateException("Cannot access the input stream after release().");
    }
    if (zzbsx == null) {
      return null;
    }
    if (zzbsh == null) {
      zzbsh = new ParcelFileDescriptor.AutoCloseInputStream(zzbsx);
    }
    return zzbsh;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void release()
  {
    if (zzbsx == null) {
      return;
    }
    if (mClosed) {
      throw new IllegalStateException("releasing an already released result.");
    }
    try
    {
      if (zzbsh != null) {
        zzbsh.close();
      }
      for (;;)
      {
        mClosed = true;
        zzbsx = null;
        zzbsh = null;
        return;
        zzbsx.close();
      }
      return;
    }
    catch (IOException localIOException) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */