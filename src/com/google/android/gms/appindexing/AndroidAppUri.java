package com.google.android.gms.appindexing;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzw;
import java.util.Iterator;
import java.util.List;

public final class AndroidAppUri
{
  private final Uri mUri;
  
  private AndroidAppUri(Uri paramUri)
  {
    mUri = paramUri;
  }
  
  public static AndroidAppUri newAndroidAppUri(Uri paramUri)
  {
    paramUri = new AndroidAppUri(paramUri);
    if (zza(paramUri)) {
      return paramUri;
    }
    throw new IllegalArgumentException("AndroidAppUri validation failed.");
  }
  
  public static AndroidAppUri newAndroidAppUri(String paramString, Uri paramUri)
  {
    paramString = new Uri.Builder().scheme("android-app").authority(paramString);
    if (paramUri != null)
    {
      paramString.appendPath(paramUri.getScheme());
      if (paramUri.getAuthority() != null) {
        paramString.appendPath(paramUri.getAuthority());
      }
      Iterator localIterator = paramUri.getPathSegments().iterator();
      while (localIterator.hasNext()) {
        paramString.appendPath((String)localIterator.next());
      }
      paramString.encodedQuery(paramUri.getEncodedQuery()).encodedFragment(paramUri.getEncodedFragment());
    }
    return new AndroidAppUri(paramString.build());
  }
  
  private static boolean zza(AndroidAppUri paramAndroidAppUri)
  {
    if (!"android-app".equals(mUri.getScheme())) {
      throw new IllegalArgumentException("android-app scheme is required.");
    }
    if (TextUtils.isEmpty(paramAndroidAppUri.getPackageName())) {
      throw new IllegalArgumentException("Package name is empty.");
    }
    Uri localUri = newAndroidAppUri(paramAndroidAppUri.getPackageName(), paramAndroidAppUri.getDeepLinkUri()).toUri();
    if (!mUri.equals(localUri)) {
      throw new IllegalArgumentException("URI is not canonical.");
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof AndroidAppUri)) {
      return mUri.equals(mUri);
    }
    return false;
  }
  
  public final Uri getDeepLinkUri()
  {
    List localList = mUri.getPathSegments();
    if (localList.size() > 0)
    {
      String str = (String)localList.get(0);
      Uri.Builder localBuilder = new Uri.Builder();
      localBuilder.scheme(str);
      if (localList.size() > 1)
      {
        localBuilder.authority((String)localList.get(1));
        int i = 2;
        while (i < localList.size())
        {
          localBuilder.appendPath((String)localList.get(i));
          i += 1;
        }
      }
      localBuilder.encodedQuery(mUri.getEncodedQuery());
      localBuilder.encodedFragment(mUri.getEncodedFragment());
      return localBuilder.build();
    }
    return null;
  }
  
  public final String getPackageName()
  {
    return mUri.getAuthority();
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { mUri });
  }
  
  public final String toString()
  {
    return mUri.toString();
  }
  
  public final Uri toUri()
  {
    return mUri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appindexing.AndroidAppUri
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */