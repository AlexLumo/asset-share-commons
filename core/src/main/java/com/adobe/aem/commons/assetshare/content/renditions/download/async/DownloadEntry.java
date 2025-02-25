package com.adobe.aem.commons.assetshare.content.renditions.download.async;

import com.adobe.cq.dam.download.api.DownloadProgress;
import com.day.cq.dam.commons.util.UIHelper;
import org.osgi.annotation.versioning.ProviderType;

import java.util.Calendar;
import java.util.Collection;

@ProviderType
public interface DownloadEntry {

    String getId();

    Calendar getStarted();

    Calendar getFinished();

    DownloadProgress.Status getStatus();

    int getProcessedCount();

    int getSuccessCount();

    int getFailureCount();

    int getTotalCount();

    long getTotalSize();

    String getFormattedTotalSize();

    boolean isComplete();

    int getProgress();

    /** These methods information about the first artifact of the DownloadProgress **/

    String getName();

    Collection<String> getSuccesses();

    Collection<String> getFailures();

    String getURI();

    default boolean isArchive() { return true; }
}
