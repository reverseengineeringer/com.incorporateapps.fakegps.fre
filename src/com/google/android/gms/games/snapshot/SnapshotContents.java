package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;

public abstract interface SnapshotContents
  extends Parcelable
{
  public abstract void close();
  
  public abstract ParcelFileDescriptor getParcelFileDescriptor();
  
  public abstract boolean isClosed();
  
  public abstract boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  public abstract byte[] readFully();
  
  public abstract boolean writeBytes(byte[] paramArrayOfByte);
  
  public abstract Contents zzsx();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotContents
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */