package com.google.android.gms.drive;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface DriveApi$MetadataBufferResult
  extends Releasable, Result
{
  public abstract MetadataBuffer getMetadataBuffer();
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.DriveApi.MetadataBufferResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */