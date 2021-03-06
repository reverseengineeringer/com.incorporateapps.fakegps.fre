package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.zzna;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity
  implements SafeParcelable, SnapshotContents
{
  public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
  private static final Object zzaKK = new Object();
  private final int mVersionCode;
  private Contents zzara;
  
  SnapshotContentsEntity(int paramInt, Contents paramContents)
  {
    mVersionCode = paramInt;
    zzara = paramContents;
  }
  
  public SnapshotContentsEntity(Contents paramContents)
  {
    this(1, paramContents);
  }
  
  private boolean zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool;
    if (!isClosed()) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Must provide a previously opened SnapshotContents");
      synchronized (zzaKK)
      {
        Object localObject2 = new FileOutputStream(zzara.getParcelFileDescriptor().getFileDescriptor());
        BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream((OutputStream)localObject2);
        try
        {
          localObject2 = ((FileOutputStream)localObject2).getChannel();
          ((FileChannel)localObject2).position(paramInt1);
          localBufferedOutputStream.write(paramArrayOfByte, paramInt2, paramInt3);
          if (paramBoolean) {
            ((FileChannel)localObject2).truncate(paramArrayOfByte.length);
          }
          localBufferedOutputStream.flush();
          return true;
        }
        catch (IOException paramArrayOfByte)
        {
          GamesLog.zza("SnapshotContentsEntity", "Failed to write snapshot data", paramArrayOfByte);
          return false;
        }
        bool = false;
      }
    }
  }
  
  public final void close()
  {
    zzara = null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final ParcelFileDescriptor getParcelFileDescriptor()
  {
    if (!isClosed()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot mutate closed contents!");
      return zzara.getParcelFileDescriptor();
    }
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean isClosed()
  {
    return zzara == null;
  }
  
  public final boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    return zza(paramInt1, paramArrayOfByte, paramInt2, paramArrayOfByte.length, false);
  }
  
  public final byte[] readFully()
  {
    boolean bool = false;
    if (!isClosed()) {
      bool = true;
    }
    zzx.zza(bool, "Must provide a previously opened Snapshot");
    synchronized (zzaKK)
    {
      FileInputStream localFileInputStream = new FileInputStream(zzara.getParcelFileDescriptor().getFileDescriptor());
      Object localObject3 = new BufferedInputStream(localFileInputStream);
      try
      {
        localFileInputStream.getChannel().position(0L);
        localObject3 = zzna.zza((InputStream)localObject3, false);
        localFileInputStream.getChannel().position(0L);
        return (byte[])localObject3;
      }
      catch (IOException localIOException)
      {
        GamesLog.zzb("SnapshotContentsEntity", "Failed to read snapshot data", localIOException);
        throw localIOException;
      }
    }
  }
  
  public final boolean writeBytes(byte[] paramArrayOfByte)
  {
    return zza(0, paramArrayOfByte, 0, paramArrayOfByte.length, true);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotContentsEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final Contents zzsx()
  {
    return zzara;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotContentsEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */