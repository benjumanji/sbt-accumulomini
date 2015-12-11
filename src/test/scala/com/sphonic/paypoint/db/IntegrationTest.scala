package com.sphonic.paypoint.db

import java.nio.file.Files

import org.apache.accumulo.minicluster.MiniAccumuloCluster
import org.apache.accumulo.core.client.ZooKeeperInstance
import org.scalatest._
import org.slf4j.LoggerFactory

class IntegrationTest extends FlatSpec {
  val log = LoggerFactory.getLogger(getClass)

  val tmp = Files.createTempDirectory("accumulo").toFile
  val cluster = new MiniAccumuloCluster(tmp, "password")

  log.info("starting cluster from test")
  cluster.start
  log.info("startup completed")


  val instance = new ZooKeeperInstance(cluster.getInstanceName, cluster.getZooKeepers)

  log.info("connecting to cluster")
  val conn = instance.getConnector("root", "password")
  log.info("connection established")

  cluster.stop
}
