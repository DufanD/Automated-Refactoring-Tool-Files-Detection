package com.finalproject.automated.refactoring.tool.files.detection.service;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import lombok.NonNull;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface FilesDetectionThread {

    void detect(@NonNull String path, @NonNull String mimeType,
                @NonNull Map<String, List<FileModel>> result);
}
